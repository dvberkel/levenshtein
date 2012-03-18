(ns levenshtein.core)

(defn abs [x] (if (> x 0) x (- x)))

(defn distance [x y] (abs (- (.length x) (.length y))))
