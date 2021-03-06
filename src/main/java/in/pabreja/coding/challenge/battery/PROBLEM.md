##### Problem : Battery Explosion

Oops! The latest shipment of laptop batteries has a minor issue. Nothing major, just a slight tendency to explode when being pushed too hard, that’s all. Some of our customers keep pestering us about this tiny defect however, and the media just won’t give us a break.

Shipping new batteries to all customers is very expensive, so we’ve come up with an ingenious way to fix this issue. See, the thing is, the battery can only explode when it’s being pushed too hard (i.e. when it is delivering too many Amperes). So we’re going to include an ammeter (a device measuring the current) and shut down the laptop when critical levels are reached.

There’s a slight problem though. We need to figure out what that critical level is. We now know from, umm, “field testing”, that the laptop can explode when delivering  milliAmperes (mA), but it is possible that explosion could occur below that level. We need to figure out the highest level which is still safe, since turning off the laptop is not very appreciated by customers, so we don’t want to do it needlessly.

You have been given two laptop batteries and a testing device. The testing device will make the battery connected to it (one battery can be connected at a time) deliver  mA, where  is an integer. The testing device is constructed in such a way that the battery will always explode if there’s any risk of explosion at that current.

You don’t want to spend too much time testing (time is money), so you want to run as few tests as possible while still figuring out the maximum current which is safe. Given Murphy’s Law (everything that can go wrong will go wrong), we want to minimize the number of tests needed in the worst case.

Remember that you only have access to two batteries, so when the first has exploded, you cannot afford to blow the second one up without being sure you’ve found the correct answer.

###### Input
Input consists of multiple lines, one line per case (at most  test cases). Each line contains a single positive integer  between  and  inclusive, giving the current at which the battery is known to explode. Input is terminated by a line containing , which should not produce any output.

###### Output
For each case, print one line containing the worst-case number of tests to perform when using an optimal testing strategy.

<table >

<tr><td>

|   Sample Input 1                  |
|-------------------------------------|
| 1 <br/> 2 <br/> 10 <br/> 23 <br/> 0 |

</td><td>

|  Sample Output 1        |
|--------------------------|
| 0 <br/> 1 <br/> 4 <br/> 7 |

</td></tr> </table>