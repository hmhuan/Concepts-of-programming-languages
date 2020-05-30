let a = 1
let b = 2
function middle(){
	let b = a
	function inner(){
		console.log(a, b)
	}
	let a = 3
	inner()
	console.log(a, b)
}
middle()
console.log(a, b)