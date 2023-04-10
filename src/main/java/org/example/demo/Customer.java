
/**********************************************************************************************************************
 * Now we are using inversion of flow b/c tight coupling is still there after introducing abstraction.
 * The customer object got created first then CurrentAccount was created .
 * we are inverting this flow now : creating the object of CurrentAccount then object of Customer will be
 * created
 * The CurrentAccount object will be passed as a constructor to Customer object(Constructor Injection)
 **********************************************************************************************************************/
package org.example.demo;
// Customer
public class Customer {
       private Register register ;
        public Customer( Register register) {
            this.register = register;

        }


    public void registerAccount() {


        if ( register.registerToAccount() ){

            System.out.println( "The customer is registered to Account");

          } else{
            System.out.println("The customer is not registered yet");
          }

    }
}
