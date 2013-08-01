;; yikebocai's solution to Split a sequence
;; https://4clojure.com/problem/49

(fn [x y]
  (let [s (map-indexed #(list (+ 1 %1) %2) y)
        s1 (map last (filter #(< (first %) (+ x 1)) s))
        s2 (map last (filter #(> (first %) x) s))]
    (conj [] s1 s2)))

;;beautiful solution
(fn [x y]
    (list (take x y) (drop x y)))
