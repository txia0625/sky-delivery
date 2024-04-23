package com.sky.config;

import com.sky.properties.AmazonS3Properties;
import com.sky.utils.AmazonS3Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class S3Configuration {

    @Bean
    @ConditionalOnMissingBean
    public AmazonS3Util amazonS3Util(AmazonS3Properties amazonS3Properties)
    {
        log.info("Started Creating AmazonS3 Utils class: {}", amazonS3Properties);
        return new AmazonS3Util(amazonS3Properties.getAccessKeyId(), amazonS3Properties.getAccessKeySecret(), amazonS3Properties.getBucketName());
    }
}
