/**
 * RMI(Remote Method Invocation)
 * It is a mechanism that enables an object on one Java virtual machine to invoke methods on an object in another Java virtual machine. 
 * Steps involve:-
 * 1.Create remote Interface.(which contain wanting method and the interface extends Remote Interface)
 * 2.Implementation the remote Interface.(the implementing class extends UnicastRemoteObject)
 * 3.Create Server
 * 4.Create Client  
 * 5.Compile all java files,
 * 6.stub and skeleton (i.e. rmic Implementing class)
 * 7.Start the registry(rmiregistry)
 * 8.Start Server
 * 9.Start Client
 * 
 * Inside java.rmi:-
 * Remote(Interface):- The Remote interface serves to identify interfaces whose methods may be invoked from a non-local virtual machine.
 * Naming (Class):- The Naming class provides methods for storing and obtaining references to remote objects in a remote object registry.
 *   
 *  =>Inside Naming class:
 *          public static void rebind(String name,Remote obj)throws RemoteException,MalformedURLException 
 *          -> Rebinds the specified name to a new remote object in the RMI registry. Any existing binding for the name is replaced.
 *              Parameters:
 *                         name- a name in URL format (without the scheme component).
 *                         obj- new remote object to associate with the name.
 */