package com.maripavlova.springbootconfig.repositories;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("prod")
public class DataSourceBean {
}
