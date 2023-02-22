# DataBaseGenerateService
## A brief description of what the project does.
Our project is a website for providing ready-made databases. There are situations when, during the creation of a project, you need to test the work of the code and for this, you need a ready-made database. There are several similar sites, such as:
- [Fake Name Generation](https://www.fakenamegenerator.com/advanced.php) 
- [Randus](https://randus.org/)
- [Fake Person Generation](https://www.fakepersongenerator.com/) 

However, only one person is provided on these sites, while our site provides an entire database filled with such information.
In our time of information technology, there are many professions related to the creation of programs. 
Our site is mainly created for people who are students of IT universities, programmers, developers, and also testers. 
This work is designed for faster testing and development.

## Website creation and operation

We are creating a repository for storing temporary data. We make a request to Mongo Atlas and then save the data in temporary storage.
Next, the program receives the required numbers to determine the data output limit. 
````
@PostMapping(value="/getRandomPersona")
    public List<PersonaFullModel> getPersonaFullModel(@RequestBody Number number)
    {
        return mainService.getPersonaFull(number);
    }
````
A cycle is started in which an identity with the issued id is created. 
This person is given a first and last name from temporarily stored databases, as well as a place of residence and work is determined. 
After the created identity is added to the final database requested by the user, which will later be displayed on the site.


### *3 people participate in our project: Turarbayev Islambek, Abdrakhmanov Ilyas and Umirgalieva Ayana.*
*Abdrakhmanov Ilyas and Umirgalieva Ayana were engaged in the backend, while Turarbayev Islambek was engaged in the frontend. 
You can contact us if you have any questions:*
- *[Turarbayev Islambek](https://t.me/goodman068)*
- *[Abdrakhmanov Ilyas](https://t.me/lyka1lyas)*
- *[Umirgalieva Ayana](https://t.me/ai_laMirA)*
