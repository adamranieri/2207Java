
fn main(){

    let fname = String::from("Adam");

    fn say_hello(name:String){
        println!("{}",name);
    }

    say_hello(fname);

    println!("{}",fname);// is unavailbe to use
    println!("Hello");
}