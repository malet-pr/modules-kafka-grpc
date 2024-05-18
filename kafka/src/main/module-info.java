module kafkaconsumer {
    requires lombok;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.kafka;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires spring.kafka.test;
    requires sprinb.boot.test;
    requires org.junit.jupiter.api;
    requires org.mockito.mockito-core;
    requires org.hamcrest;
    requires awaitility;

    requires orderService.persistence;

}