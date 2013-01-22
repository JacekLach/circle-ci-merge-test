(ns circle-ci-merge-test.core-test
  (:use clojure.test
        circle-ci-merge-test.core))

(defn foo []
  2)

(deftest master-test
  (testing "FIXME, I fail."
    (is (= 0 0))))
