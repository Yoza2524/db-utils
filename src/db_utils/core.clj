(ns db-utils.core
  (:require [mount.core :as mount]
            [cprop.core :refer [load-config]]
            [cprop.source :as source]))





(mount/start)

(load-config)
(source/from-env)
