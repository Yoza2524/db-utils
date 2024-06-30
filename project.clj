(defproject db-utils "0.1.0-SNAPSHOT"
  :description "db-utils"

  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}

  :dependencies [[org.clojure/clojure "1.11.1"]
                 [mount "0.1.17"]
                 [cprop "0.1.20"]]
  :profiles     {:dev [:project/dev :profiles/dev]

                 :project/dev  {;; :source-paths ["."]
                                :resource-paths ["resources"]}
                 :profiles/dev {}}
  :repl-options {:init-ns db-utils.core})
