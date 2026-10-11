class MyHashSet {
    
    constructor() {
       this.array= new Array(1000001).fill(0); 
    }

    /**
     * @param {number} key
     * @return {void}
     */
    add(key) {
        this.array[key]=1;
    }

    /**
     * @param {number} key
     * @return {void}
     */
    remove(key) {
        this.array[key]=0;
    }

    /**
     * @param {number} key
     * @return {boolean}
     */
    contains(key) {
        if(this.array[key]===1){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = new MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
