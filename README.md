wiki_crawler
============

A Simple Java based Wikipedia Crawler.

What it can do?

This code will read the input.txt file line by line and will generate a output textfile for each of the topics which was read from the input file with contents of the wiki article.

Eg: If you create a text file with contents:-

	Hacking
	Software Engineer
	Information retrieval


Then it will generate hacking.txt, software_engineer.txt, and information_retrieval.txt With their corresponding wikipedia.org entries in plain text (will remove html tags).


What you can do?

You can modify the code to read the topics from database and then write the crawled data back to database.


Requirements:

1. Java Version 1.6 or above.
2. JSoup library for parsing wiki contents (http://jsoup.org/)
