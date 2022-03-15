### Problem A

##### Airport Coffee

###### Problem ID: airportcoffee
###### Time limit: 6 seconds
###### Picture by atulknareda on Pixabay


###### Problem Description:
Jonna often travels to programming contests by airplane. Since
she lives in Helsinki, she often has to first travel to some large
airport hub, such as Copenhagen Airport, where she takes a new
flight. Unfortunately, flights are often very late. This is especially
problematic when taking a connecting flight.
As it happens, Jonna just landed at Copenhagen Airport, trying
to make her connection to Heathrow Airport. Since her flight
from Helsinki was delayed, she must walk very quickly from her
arrival gate to the new departure gate. Normally, Jonna walks
at a speed of a centimeters per second. To make matters more
difficult, Jonna has a slight coffee addiction, and will walk very
sluggishly while not drinking coffee. While the coffee itself does not really affect the walking
speed, the resulting grumpiness from not drinking coffee trumps even the worries of a missed
flight. When she is drinking coffee, her speed increases to b centimeters per second.
The distance between Jonna’s arrival and departure gates is centimeters, and along the way
there are n small coffee carts where Jonna can buy a cup of coffee. When buying a cup of coffee
(a practically instant endeavour nowadays, thanks to contactless card payments), she first waits
for t seconds, in order to let it cool down. During this time, she will keep walking at the slower
pace. Immediately after t seconds pass, she starts drinking the coffee. It takes exactly r seconds
to finish the coffee (during which she walks at the faster pace). When the coffee is finished, she
will again walk slower.
Note that Jonna is carrying a bag with her left hand, so she can only carry a single cup of
coffee at a time. While a bit wasteful, she may throw away a cup that still contains some amount
of coffee to purchase a brand new cup.
Can you help Jonna determine where to purchase her coffee(s), in order to get to her departure
gate as quickly as possible?
Input
The first line of input contains five integers `, a, b, t and r, where:
 1  `  1011 is the distance between Jonna’s arrival and departure gates in centimeters.
 1  a < b  200 are Jonna’s walking speeds in centimeters per second when she is not
and when she is drinking coffee, respectively.
 0  t  300 is the number of seconds Jonna must wait until she can drink her coffee.
 1  r  1200 is the number of seconds it takes for Jonna to drink a cup of coffee.
Then follows a line containing an integer 0  n  500 000, the number of coffee carts between
the two gates. The third and last line of input contains n integers – the positions of the coffee
carts, given in ascending distance from the departure gate in centimeters (i.e., each number is
between 0 and `, inclusive). No two coffee carts are in the same postion.

Output
First, output a line containing the number of carts where Jonna should purchase coffee. Next,
output a single line containing the indices of the coffee carts where Jonna should buy coffee.
These indicies should be between 0 and n 􀀀 1, and correspond to the order of the coffee carts in
the input. The indices may be output in any order, but each index must be output at most once.
Your answer will be accepted if the time that the proposed coffee purchasing plan takes is
within an absolute or relative error of at most 10􀀀9 compared to the optimum time.
0 100 000
Figure A.1: Illustration of Sample Input 1 and a possible solution. The coffee shops Jonna uses
are marked with triangles. The portions where she walks faster due to the effects of coffee are
marked with a dotted line. The first coffee cools down 11 000 centimeters from the starting
position, and the second after 61 000 centimeters from the starting position.


| Sample Input 1                        | Sample Output 1 |
|---------------------------------------|-----------------|
| 100000 100 138 60 300  <br/> 5 <br/> 5000 20000 50000 55000 75000 | 2 <br/> 0 3     |

| Sample Input 2                                                 | Sample Output 2 |
|----------------------------------------------------------------|-----------------|
| 100000 78 86 9 560  <br/> 4 <br/> 13505 69705 87448 92090 | 2 <br/> 0 1     |


##### Problem references :
http://www.cs.ucf.edu/~dmarino/progcontests/mysols/collegeregional/ncpc/2017/ncpc2017problems.pdf

##### Solution references :
http://www.cs.ucf.edu/~dmarino/progcontests/mysols/collegeregional/ncpc/2017/a.java
