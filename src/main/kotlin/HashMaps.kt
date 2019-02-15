/** Created by Omar Parra on 2/15/19 at 12:41 PM */

fun main(args: Array<String>) {
    var hashmap = HashMap<String, String>()
    //var hashmap = HashMap<Any, Any>()
    hashmap.put("Karla", "Married")
    hashmap.put("Omar", "Married")
    hashmap.put("Luis", "Single")

    for (k in hashmap.keys){
        print("$k is ")
        for (item in hashmap.getValue(k)){
            print(item)
        }
        println()
    }

    //println(hashmap.get("Omar"))

}
