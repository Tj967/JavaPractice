package Test;

public class Book {
        private int isbnid;

        private String bookName;

        private String authorName;



        public void setIsbnid(int in){
            this.isbnid=in;
        }


        public void setBookName(String n){
            this.bookName=n;
        }
        public  void setAuthorName(String n){
            this.authorName=n;
        }
        public String getBookName(){
            return this.bookName;
        }
        public String getAuthorName(){
            return this.authorName;
        }

        public int getIsbnid(){
            return  isbnid;
        }

        @Override
        public String toString(){
            return "isbnid: "+this.isbnid+"\t book name:"+this.bookName+" \t" +
                    "Author Name: "+this.authorName;
        }


}
