# KML Framework introduction #
The KML Framework is a library/framework for generating Google Earth KML (Keyhole Markup Language) documents. The framework is based on the work done by Eivind Bøhn as a part of his Master Thesis. Now, two years later, the work is finally released as an open source project after several requests.

There is also a Google group for discussing this framework and being updated on new releases. Please feel free to take a look and join at http://groups.google.com/group/kmlframework

All comments are highly appreciated. Only then Eivind will be inspired to continue updating this framework;)

I hope you find this small piece of work helpful!

Best regards,
Eivind Bøhn
eivind@boehn.org

# Current TODOS #
  * Classes for Dynamical creation of KML files are not yet updated to match the updated KML 2.2 classes. These will be updated shortly
  * Extend the framework with easy usage of the new `<Change>` tag in KML

# Version history #

## 2010-10-14 ##
Several improvements and bugfixes to several types and added the touring API. --By Updownquark.

## 2009-07-18 ##
Added Kml.toString() and Kml.createKmz(String fileName) provided by Ringo Wathelet. Thanks!

## 2009-03-20 ##
Fixed issue reported by Gerald: Corrected misprint "visability" to "visibility" all places in code and XML. Thanks!

## 2009-01-30 ##
Fixed issue reported by Anders: Corrected XML Placemark tag when using the Delete element. Thanks!

## 2008-12-14 ##
Improvements based on comments from Frank:
  * Using UUID.randomUUID() to generate unique object ids.
  * Removed System.out.println from Placemark
  * Changed public XML\_INDENT variable in the Kml class to get/setXmlIndent() methods. Thanks Frank!

## 2008-12-11 ##
Added support for multiple StyleSelectors according to KML specifications, requested/reported by Mathias. Thanks!

## 2008-12-10 ##
Fixed issue reported by Asaf: NullPointerException in Container due to System.out test print that was not removed. Thanks Asaf!

## 2008-11-30 ##
Fixed issue reported by Ivan: Styles not included in Document. Thanks Ivan!

## 2008-07-21 ##
Fixed issue [1 (Double Placemark tag in Document)](http://code.google.com/p/kmlframework/issues/detail?id=1).

## 2008-07-18 ##
This version should be fully functional for generating static KML documents easily from Java.
  * Major update of KML to version 2.2
  * Clean up in package structure
  * Removed dependencies to 3rd party XML libraries
  * Included source code, examples, javadoc and Readme file in distribution
  * All classes not yet updated contains a "todo" in their package path

## 2008-07-08 ##
Added original version of source code, unedited