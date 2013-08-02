;; yikebocai's solution to Greatest Common Divisor
;; https://4clojure.com/problem/66

(fn [x y] 
  (last 
   (filter 
    #(and (= 0 (mod x %)) (= 0 (mod y %))) 
    (map #(+ % 1)  (range x)))))
