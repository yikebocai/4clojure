bocai's solution to Map Construction
;; https://4clojure.com/problem/61

(fn [s1 s2] (apply  merge (map #(conj {} {%1 %2}) s1 s2)))
