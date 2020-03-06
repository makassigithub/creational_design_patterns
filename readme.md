Design Pattern
  1.Creational
    a.Singleton: ex Java Runtime, Some Loggers...
      Use: When we only need one instance of an object in the app scope.
      Construction: static instance, static getInstance, private constructor.
                    The instance can be lazy loaded for performance improvement and must 
                    Volatilize and synchronized if is exposed to many thread, to make it thread safe
    b.Builder: ex StrinBuilder class
      Use:When there is a need for complexe objects, That need to be made immutable. Beans ease the 
          construction but make are mutable, Telescoping contructors, help achieving immutability but
          Are not flexible enough for various state construction.Inner static class(Builder)
          #.Outer class
		-Private static final member fields (enforce imutability)
                -Private constructor that takes an instance of the inner class called Builder 
                   and set his own fields from the builder instance
          #.Inner static class
                - A default non arg constructor
                - same member field as the outter (only private)
                - a setter method for each field setting the field and returning his own instances(enforce flexibility)
                - a build method that returns an instance of the outter after newing  its private
                  constructor and passing himself to it.
                  ex: LaunchOrder.Builder = new LunOrder.Builder();
			builder.bread("wheat").condiment("pepper").sauce("mayo");
                        LuanchOrder order = buildr.build()

   c.Prototype patten: ex java.lang.Object#clone()
     Use: When we want to avoid costly object creation of and object but we wan to get a unique instance of it
	  by copying the member variables and having each instance unique (shallow copy), also when we want to avoid subclassing and an
          abusif use of new,It is somtimes impelemnted with an interface and usually uses a registry.

   d.Factory pattern: Common inteface, implementation defered to subclasses. Calendar, NumberFormat,..
     	  Use: the opposite of the singleton, Factory base class is abstract i.e doesn't expose the instanciation logique,
		but deffers the creation of object to the subclasses. Tha FactoryClass itself exposes a static interface to clients.
                Most of the time implemented with framework so that the user decides about instanciation
   
   e.Abstract Factory: Factory of factorie, i.e factory of related object. ex: java xml DocumentBuilder
   	the factory method returns a FactoryItself based on certain criteria, and each factory embedds is 
        own logique.

          

		      	         
                

          
          
       

      
