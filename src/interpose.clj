;; yikebocai's solution to Interpose a Seq
;; https://4clojure.com/problem/40

(fn [x y] 
  (drop-last 
   (reduce 
    #(concat %1 
             (replicate 1 %2) 
             (replicate 1 x)) 
    [] y)))
