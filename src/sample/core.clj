(ns sample.core
  (:gen-class))

(use 'clojure.java.io)
(use '[clojure.string :only (join split)])



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (with-open [rdr (reader "./chun.PitchTier.csv")]
    (doseq [line (line-seq rdr)]
      (println (split line #"\,")))))