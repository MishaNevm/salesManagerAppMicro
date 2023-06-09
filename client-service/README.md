# Client service
###### представляет собой микросервис, отвечающий за операции, связанные с клиентами.
#### Используемые технологии:

###### Java 17
###### Spring Boot Starter Data JPA
###### Jackson
###### Flyway Core
###### Spring Kafka
###### PostgreSQL
###### ModelMapper

#### Функциональность

###### Класс BankController является компонентом Spring для обработки операций, связанных с банками. Он взаимодействует с другими компонентами, такими как Producer, BankService и BankDTOUniqueValidator. Некоторые из его методов включают:

###### findAll(): Получает все банки с помощью BankService и отправляет сообщение с результатом в топик с использованием Producer.
###### findById(int id): Получает банк по идентификатору с помощью BankService и отправляет сообщение в топик с использованием Producer.
###### create(BankDTO bankDTO): Выполняет валидацию данных банка с помощью BankDTOUniqueValidator. Если данные проходят валидацию, то вызывается метод save у BankService для создания нового банка. Затем результат операции отправляется в топик с использованием Producer.
###### update(BankDTO bankDTO): Выполняет валидацию данных банка с помощью BankDTOUniqueValidator. Если данные проходят валидацию, то вызывается метод update у BankService для обновления информации о банке. Затем результат операции отправляется в топик с использованием Producer.
###### delete(int id): Вызывает метод delete у BankService для удаления банка по идентификатору.

###### Класс ClientController является компонентом Spring для обработки операций, связанных с клиентами. Он взаимодействует с другими компонентами, такими как ClientService, ClientDTOUniqueValidator и Producer. Некоторые из его методов включают:

###### findAll(): Получает всех клиентов с помощью ClientService и отправляет сообщение с результатом в топик с использованием Producer.
###### findById(int id): Получает клиента по идентификатору с помощью ClientService и отправляет сообщение в топик с использованием Producer.
###### create(ClientDTO clientDTO): Выполняет валидацию данных клиента с помощью ClientDTOUniqueValidator. Если данные проходят валидацию, то вызывается метод save у ClientService для создания нового клиента. Затем результат операции отправляется в топик с использованием Producer.
###### update(ClientDTO clientDTO): Выполняет валидацию данных клиента с помощью ClientDTOUniqueValidator. Если данные проходят валидацию, то вызывается метод update у ClientService для обновления информации о клиенте. Затем результат операции отправляется в топик с использованием Producer.
###### delete(int id): Вызывает метод delete у ClientService для удаления клиента по идентификатору.
## Настройка и развертывание

###### Клонируйте репозиторий проекта.
###### Установите все необходимые зависимости, указанные в файле pom.xml.
###### У Вас должна быть запущена Kafka и Docker.
###### Выполните команду "docker-compose up" в теминале, находясь в корневой папке сервиса.
###### Запустите сервис на вашем сервере или локальной машине.
###### Проверьте работоспособность сервиса, обращаясь к соответствующим url в UserOrchestrationService или Frontend.
###### Зайти сможете по логину и паролю admin