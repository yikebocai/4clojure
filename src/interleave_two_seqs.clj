;; yikebocai's solution to Interleave Two Seqs
;; https://4clojure.com/problem/39

(fn [s1 s2] 
  (let [f1 (count s1) 
        f2 (count s2) 
        m (min f1 f2)] 
    (loop [s [] i 0] 
      (if (< i m) 
        (recur 
         (conj (conj s (nth s1 i)) (nth s2 i) )
         (inc i))
        s))))
