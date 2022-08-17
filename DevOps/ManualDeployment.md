# Manual Deployment
- Deployement refers to putting an app in a state where it could be used by the public

## Azure Manual Deployment 
1. We had to create a **virtual machine** to run the application
   1. Pick the operating system sometimes called the *machine image*
   2. Pick the size of the virtual
      1. Virtual processor and ram
   3. Create a private key 
      1. .pem file
   4. SSH into that virtual machine
      1. ***SSH** Secure Shell
      2. It is a comuunication protocol typically used to connect to linux machine
      3. Windows OS uses RDP or remote desktop protocol
2. Dependncy manager **apt** to quickly install Java
3. git clone to get my source code onto the machine
4. used gradle to build the jar file
   1. had to make the gradlew executiable
   2. chmod +x gradlew
5. Execute my Java App
   1. java -jar hello-app.jar &
      1. Allows running the app in the background
6. Configure the firewall around the VM to allow HTTP traffic to port 8080
7. disown process ID to prevent closing the connection to the vm shutting down your Java app 

- Manually deploying apps is a tedious process

   
