;; yikebocai's solution to Reverse a Sequence
;; https://4clojure.com/problem/23

#(loop [s [] i (- (count %1) 1)] (if (> i -1) (recur (conj s (nth (vec %1) i)) (dec i)) s))

