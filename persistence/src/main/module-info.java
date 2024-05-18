module orderservice {
    requires lombok;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.starter.web;
    requires spring.boot.starter.data.jpa;
    requires spring.boot.starter.data.jdbc;
    requires org.postgresql.postgresql;
    requires java.sql;

    exports orderservice.persistence;

}