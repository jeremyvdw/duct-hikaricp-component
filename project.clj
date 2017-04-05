(defproject duct/hikaricp-component "0.2.0"
  :description "A component for managing a HikariCP connection pool"
  :url "https://github.com/weavejester/duct-hikaricp-component"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.stuartsierra/component "0.3.2"]
                 [com.zaxxer/HikariCP "2.6.1"]
                 [org.slf4j/slf4j-nop "1.7.7"]]
  :profiles
  {:dev {:dependencies [[org.clojure/java.jdbc "0.3.6"]
                        [com.h2database/h2 "1.4.183"]]}})
