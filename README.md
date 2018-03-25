# AndroidSourceFlavoring-II
Pattern-II 

   Most secure/convenient way of writting source flavoring with maintaining scope for future decoration of specific classes.
   In this we use Proxy Pattern to expose APIs from facade with having only 1 code base.
            
   Here we need to add files on same package structure as files in main, so flavored files can refer them with their names and these base code files don't need to be public[So if we share aar the end user won't able to call these files directly].
   
   If we want to change the code changes will only heppen in terms of logic in base code files in main source folder.
   The only thing we need to take care is to add newly added method to particular flavor it would be exposed through.
   In this way we can even have the code that will not be part of any flavor for this deliverable but of next.
   When we obfuscarte the code the newly added non referred code in flavor is removed from base code files.
   In this pattern we've to keep only referring files in flavor folder [You can refer generic & special flavor folder].
   
This repo will demonstrate the Pattern-II for java/Android source flavoring using Proxy Pattern.
