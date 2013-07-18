;; yikebocai's solution to Palindrome Detector
;; https://4clojure.com/problem/27

(fn [s] (let [rv (reverse (vec s))
              cnt (/ (count rv) 2)
              s1 (take cnt (vec s))
              s2 (take cnt rv)]
          (= s1 s2 )) )
