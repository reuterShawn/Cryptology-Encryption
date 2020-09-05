# Cryptology-Encryption

Our key is "rickroll"

We used Kasiski examination to deterimine key lengths. This was implemented using tools available in most word prossessing software. 
We identified repeats in the text by looking closely at the text and control f. Length between repeats was determined using word count. 
Once we determined several of these lengths, we determined the key length by looking at common divisors of these. 

After we found the key length, we used one of two methods: frequency analysis and brute force.  

To do frequency analysis we took all of the text that was encrypted using the same part of the key and used [this tool](https://www.dcode.fr/frequency-analysis) to create frequency graphs. Using that we would try to figure out what shift was done on that part of the text usually by guessing that the most frequent ciphertext letter maps to an e in the plaintext. Once we have our guess we use a ceaser cipher on this chunk of the text and rerun the frequency analysis. If it looks like it is a match we take note of this letter and then repeat the process. Once we have enough of the key we can try to guess the rest or search online dictionaries to figure out the rest.

In our brute force method we took [a list of english words](https://github.com/dwyl/english-words/blob/master/words_alpha.txt) and ran the decryption on the cyphertext for all words of apropriate length. Once this was done we filtered out texts that didn't include common digraphs such as "in", "er", and "an". This would get us down to a reasoable number to look through by hand.

One approach we did try that wasn't fruitful was the key elimination method. The Wikipedia page that talked about it was a bit unclear and we couldn't find any other resources for this. We are unsure if we didn't make any progress because we were simply doing things wrong or if we just didn't try hard enough here. 

Keys:

Aaron Otten and Joe Walbran - swamp (freq anal)

Brian Schadow and Aaron Walter - floating (brute force)

Kedrick, Jaydon, Vantou - zyzzyva (brute force)

Austin and Nicc - daunting (freq anal and dictionary search)

Dylan, Utkarsh and Johannes - equinox (brute force)

Aaron Corpstein and Taylor Carrington - united (freq anal)

Elena - oscar (brute force)

Cassie and Jake - rolled (brute force)

Melissa and Ananya - 6 letters

