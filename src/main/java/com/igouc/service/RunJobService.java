package com.igouc.service;

import com.igouc.job.RepositoryToEsJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RunJobService {
    @Autowired
    private RepositoryToEsJob repositoryToEsJob;

    private static final int REPOSITORY_TO_ERS_JOB = 1;

    public void runJob(Integer jobNum) {
        if (jobNum == REPOSITORY_TO_ERS_JOB) {
            repositoryToEsJob.start();
        }
    }
}
