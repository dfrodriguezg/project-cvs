/*
 * Copyright 2005-2016 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package cvs.cvs.configurador;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import cvs.cvs.properties.DatasourceProducerBase;


@Configuration
public class DatasourceConfigurationProducer {

    @Autowired
    private DatasourceProducerBase consumerBase;
    
    @Bean("dataSource")
    public DriverManagerDataSource getConfig() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(consumerBase.getDriver());
        dataSource.setUrl(consumerBase.getUrl());        
        dataSource.setUsername(consumerBase.getUser());
        dataSource.setPassword(consumerBase.getPasswd());

        return dataSource;
    }
    
 

}