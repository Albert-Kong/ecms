package com.zs.ecms;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.zs.ecms.mapper")
public class EcmsApplication {


    public static void main(String[] args) {
       SpringApplication.run(EcmsApplication.class,args);
    }

}
