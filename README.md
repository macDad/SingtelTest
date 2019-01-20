# SingtelTest
1. Can you implement the sing() method for the bird? **`Done`**

    a. How did you unit test it?    **`Done`**    
    b. How did you optimize the code for maintainability? **`Create separate class files instead of one file.`**

2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?

    a. A duck says: “Quack, quack”      **`Done`**      
    b. A duck can swim        **`Done`**    
    c. A chicken says: “Cluck, cluck”       **`Done`**     
    d. A chicken cannot fly     **`Done`**
    
3. Now how would you model a rooster?
    
    a. A rooster says: “Cock-a-doodle-doo” **`Done`**    
    b. How is the rooster related to the chicken? **`Rooster is a specific type of Chicken`**   
    c. Can you think of other ways to model a rooster without using inheritance? **`We can think rooster as an animal or a Bird and implement all the related behaviours according to the rooster itself without implements or extend from chicken.`**


4. Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.

    a. A parrot living with dogs says: “Woof, woof”       **`Done`**    
    b. A parrot living with cats says: “Meow”        **`Done`**   
    c. A parrot living near the rooster says: “Cock-a-doodle-doo”          **`Done`** 
    d. How do you keep the parrot maintainable? What if we need another parrot
    lives near a Duck? Or near a phone that rings frequently?       **`Implemented Helper Class for sounds.`**


B. Model fish as well as other swimming animals

1. In addition to the birds, can you model a fish?

    a. Fishes don’t sing  **`Done`**   
    b. Fishes don’t walk **`Done`**    
    c. Fishes can swim**`Done`** 

2. Can you specialize the fish as a Shark and as a Clownfish?

    a. Sharks are large and grey**`Done`**     
    b. Clownfish are small and colourful (orange)**`Done`**     
    c. Clownfish make jokes   **`Done`**  
    d. Sharks eat other fish**`Done`** 
    

3. Dolphins are not exactly fish, yet, they are good swimmers

    a. Can you model a dolphin that swims without inheriting from a fish class? **`Done`**   
    b. How do you avoid duplicating code or introducing unneeded overhead?  **`Without extend from Fish extend using Animal and implements using Swimmable interface. `**  

D. Model animals that change their behaviour over time

1. Can you model a butterfly?

    a. A butterfly can fly   **`Done`** 
    b. A butterfly does not make a sound **`Done`**

2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?

    a. A caterpillar cannot fly   **`Done`**  
    b. A caterpillar can walk (crawl) **`Done`**

E. Counting animals

Suppose you have an array of animals, e.g.

1. Can you share the code to count:

    a. how many of these animals can fly?**`Done`**     
    b. how many of these animals can walk?    **`Done`**    
    c. how many of these animals can sing?   **`Done`**     
    d. how many of these animals can swim?**`Done`**

BONUS

If you still have time left, please consider the following:

1. Can you add a second language (if you know a language other than English) Use the
rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds
differently depending on language. Please add the rooster sound in your native
tongue. **`Done`**

2. Can you design a RESTful API for querying these animals?
