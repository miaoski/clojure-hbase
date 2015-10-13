(defproject clojure-hbase "0.98.12"
  :description "A convenient Clojure interface to HBase."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.apache.hbase/hbase-client "0.98.12-hadoop2"]
                 [org.apache.hbase/hbase-server "0.98.12-hadoop2"]
                 [log4j/log4j "1.2.16" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jdmk/jmxtools
                                                    com.sun.jmx/jmxri]]
                 [org.clojure/tools.logging "0.2.3"]])
