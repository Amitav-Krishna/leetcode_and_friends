/* 
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {

    let num1 = 0;
    let num2 = 0;

    class ListNode {
        constructor(val = 0, next = 0) {
            this.val = val
            this.next = next
        }
    }
    
    for (let i = 0; i < l1.length; i++) {
        num1 += l1[i]*(10**i);
    }
    for (let j = 0; j < l2.length; j++) {
        num2 += l2[j]*(10**j)
    }
        
    let num3 = num1 + num2;
    let nodes = []
    let str_num3 = String(num3);
    for (let n = 0; n < str_num3.length; n++) {
        nodes.push(new ListNode(Number(str_num3[n]), nodes[n+1]))
    }
    
    return nodes;
}
console.log(addTwoNumbers([0, 0, 1], [0, 0, 2]))
