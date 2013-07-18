;; yikebocai's solution to Maximum value
;; https://4clojure.com/problem/38

(fn [& nums] 
  (loop [mx 0 i 0] 
    (if (< i (count nums)) 
      (recur 
       (if (> mx (nth nums i)) 
         mx 
         (nth nums i ) ) 
       (inc i)) 
      mx)))
