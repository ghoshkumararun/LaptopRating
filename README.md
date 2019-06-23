# LaptopRating
LaptopRating

There are two folders 1. laptopRate.UI, 2) springboot_techm_task

1. laptopRate.UI - this is an angular project.
Please download, setup and run using ng serve. You can use VS code for the changes.

2.springboot_techm_task - this is a spring boot application. Use STS to import and run as Spring Boot application

There are two services :

@GetMapping("/all") - service provide all laptop details	
@GetMapping("/update/{lapid}/{rating}") - Submit rating and provide the average rating of the product.

No database present. Data coming from Spring back-end.
