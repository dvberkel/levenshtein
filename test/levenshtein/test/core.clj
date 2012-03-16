(ns levenshtein.test.core
  (:use [levenshtein.core])
  (:use [clojure.test]))

(deftest levenshtein-distance ;; Calculate the Levenshtein distance between two strings.
  (is (= 0 (distance (str) (str))))
  (is (= 1 (distance (str) (str 'a))))
)
