(ns immutant.init
  (:use jecode.handler)
  (:require [immutant.web :as web]))

(web/start "/jecode" app)
