// const array = ["Juanchis", "Karen", "Paco"];
// array.push("Ana");
// array;

class MyArray {
  constructor() {
    this.lenght = 0;
    this.data = {};
  }

  get(index) {
    return this.data[index];
  }

  push(item) {
    this.data[this.lenght] = item;
    this.lenght++;
    return this.data;
  }

  // borra el ultimo elemento
  pop() {
    const lastItem = this.data[this.length - 1];
    delete this.data[this.length - 1];
    this.length--;
    return lastItem;
  }

  delete(index) {
    const item = this.data[index];
    this.shiftIndex(index);

    return item;
  }
  shiftIndex(index) {
    for (let i = index; i < this.length - 1; i++) {
      this.data[i] = this.data[i + 1];
    }
    delete this.data[this.length - 1];
    this.lenght--;
  }
}

const myArray = new MyArray();
myArray.push("Jose");
myArray.push("Adrian");
myArray.push("Oscar");
myArray.delete(1);
myArray;
