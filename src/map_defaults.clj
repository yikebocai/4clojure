;; yikebocai's solution to Map Defaults
;; https://4clojure.com/problem/156

#(apply hash-map (interleave %2 (repeat %1)))
