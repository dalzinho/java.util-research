# Things What I Found in the `java.util.*` document.

## Locale

* The locale package contains relevant information for locale-sensitive details, such as local language, currency, number formatting, script and so on.
* There are a handful of defaults, given as constants. Scotland remains strangely absent from this list :)

## Currency

* The Currency package manages currency representation. You define a currency using its ISO standard name (i.e. GBP, USD, EUR and so on).
* The package has methods for getting appropriate display names for a given locale, getting the symbol for a currency and so on.
* You can see examples of this in the LocalExamples.java file.

## Timer

* Timer appears to allow tasks to be scheduled for either specific times or dates, or at scheduled intervals.
* This could be handy for automating regular tasks.
* Alas I can't make head nor tail of the syntax—at least, not enough to make it work.

## Spliterators.AbstractDoubleSpliterator

* As is well known, this is an alternative to creating a spliterator from an iterator, which affords a limited degree of parallelism.
* Do I get a prize?
