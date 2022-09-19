# Task Challange [Software Engineering, Java: Practical Task]
### Aphoteke
Chalance is about fetching data from external github api

#### Externa Api Gateway
---
#### End-Point:

- **customSearch**
  - Post http://localhost:8080/customSearch
#### Controller:
  - **The Controller has one post end-point method called searchByRequest.**
  
  - **The method waiting reuest body as Object in the Array.It is allow to search multiple request at the same time.**

#### Request Body:

- **It has four paramaters to fill for tge Json Object:**
  
  - **language: The String datatype to filter languages for instance "Java","Go","CSharp" etc.**
  - **per_page: The number of results per page example 10,50,100.**
  - **lpopular_repository: Boolean True or False if true is slected it will bring popular repositores by descented order.**
  - **lcreated_date: Date formatting must follow the ISO8601 standard, which is YYYY-MM-DD (year-month-day).**
  - **ldirection_date: You can search for dates that are earlier or later than another date, or that fall within a range of dates, by using >, >=, <, <=.**
  - **lspecific_word: Spring data type for Search for any specific word in the Repositories.**
  
##Example For One Request:

```
[
  {
        "language":"CSharp",
        "per_page":20,
        "popular_repository":true,
        "created_date":"2022-06-10",
        "direction_date":">",
        "specific_word":"cats" 
    }
]
```

##Example For Multiple Request:

```
[
  {
        "language":"Go",
        "per_page":10,
        "popular_repository":true,
        "created_date":"2022-01-10",
        "direction_date":">",
        "specific_word":"cats" 
    },
    {
        "language":"Java",
        "per_page":10,
        "popular_repository":true,
        "created_date":"2022-01-10",
        "direction_date":"<",
        "specific_word":"cats" 
    }
    
]
```
