let arr = [ 90, 65, 70, 66, 91, 88];
let sortIndexMap = getSortMap(arr);
console.log(sortIndexMap);
console.log(sortIndexMap.get(3));
console.log(sortIndexMap.get(2));
console.log(sortIndexMap.get(4));

/**
 * 获取数组原顺序对应的排序顺序Map。
 * @param arr 原未排序数组
 * @return
 * */
function getSortMap(arr){
  //深层拷贝另一个数组arr1； 新建一个map
  let arr1 = [...arr], map = new Map();;
  //对arr1的数字进行从大到小排序
  arr1.sort(function(a, b){return b - a});
  //map的key是原数组arr中的序号，map的value是元素在arr1中的位置
  for(let index in arr) {
    map.set(parseInt(index), arr1.indexOf(arr[index]) + 1);
  }
  return map;
}