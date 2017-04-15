package com.igouc.job;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.igouc.common.util.ListUtil;
import com.igouc.common.util.MagicNum;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public abstract class BaseJob<T> {

    private Logger log = null;
    private int limit = 100000;
    private int poolSize = 100;
    private int groupSize = 1000;
    private String jobName = " JOB";
    private long lastId = 0;

    private ExecutorService pool;

    public void start() {
        init();
        dispose();
        finish();
    }

    private void init() {
        this.log = getLog();
        this.limit = getLimit();
        this.poolSize = getPooSize();
        this.groupSize = getGroupSize();
        this.lastId = getLastId();
        this.jobName = String.format("[%s] %s", getJobName(), jobName);
        checkValidPara();
        pool = Executors.newFixedThreadPool(poolSize);
        log.info(String.format("初始化[%s]成功,limit[%s], poolSize[%s], groupSize[%s]", this.jobName, this.limit, this.poolSize, this.groupSize));

    }

    private void checkValidPara() {
        try {
            if (this.log == null) {
                throw new Exception(String.format("参数log[%s]不合法", this.log));
            }
            if (MagicNum.lessThanAndEqualsZero(this.limit)) {
                throw new Exception(String.format("参数limit[%s]不合法", this.limit));
            }
            if (MagicNum.lessThanAndEqualsZero(this.poolSize)) {
                throw new Exception(String.format("参数poolSize[%s]不合法", this.poolSize));
            }
            if (MagicNum.lessThanAndEqualsZero(this.groupSize)) {
                throw new Exception(String.format("参数groupSize[%s]不合法", this.groupSize));
            }
            if (StringUtils.isBlank(this.jobName)) {
                throw new Exception(String.format("参数jobName[%s]不合法", this.jobName));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private void finish() {
        log.info(String.format("结束执行[%s]JOB", getJobName()));
    }

    private void dispose() {
        boolean done = Boolean.FALSE;
        while (!done) {
            List<T> dataList = getDataList(lastId, limit);
            if (ListUtil.isNotEmptyList(dataList)) {
                List<List<T>> splitLists = ListUtil.splitList(dataList, groupSize);
                CountDownLatch countDownLatch = new CountDownLatch(splitLists.size());
                for (List<T> oneGroup : splitLists) {
                    try {
                        pool.execute(() -> {
                            try {
                                disposeOneGroup(oneGroup);
                            } catch (Exception e) {
                                log.error(String.format("处理数据异常 message[%s]", e));
                            } finally {
                                countDownLatch.countDown();
                            }
                        });
                    } catch (Exception e) {
                        log.error(String.format("执行[%s]线程池出错 message[%s]", getJobName(), e));
                        countDownLatch.countDown();
                    }
                }
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    log.error(String.format("执行[%s]线程池await出现异常 message[%s]", getJobName(), e));
                }
                lastId = getLastListId(dataList);
                log.info(String.format("执行[%s]已经处理最大id[%s]", getJobName(), lastId));
            } else {
                done = Boolean.TRUE;
            }
        }
    }


    private void disposeOneGroup(List<T> oneGroup) {
        if (ListUtil.isEmptyList(oneGroup)) {
            return;
        }
        for (T data : oneGroup) {
            disposeData(data);
        }

    }

    protected abstract long getLastListId(List<T> dataList);

    protected abstract void disposeData(T data);

    protected abstract List<T> getDataList(long lastId, int limit);

    protected abstract Logger getLog();

    protected abstract int getLimit();

    protected abstract int getPooSize();

    protected abstract int getGroupSize();

    protected abstract String getJobName();

    protected abstract long getLastId();
}
