;; yikebocai's solution to Implement range
;; https://4clojure.com/problem/34

(fn [m1 m2] 
  (loop [s [] i m1] 
    (if (< i m2) 
      (recur (conj s i) (inc i)) 
      s )))
