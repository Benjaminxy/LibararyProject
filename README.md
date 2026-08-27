# Library Project

A small Java practice project for managing a library: books, users, and book loans.
No database, no framework everything is kept in plain arrays in memory, so once you
stop the program, everything you added is gone. It's meant for learning, not production.

## What it can do

- Add and remove books
- Add users
- List all books, all users, or a simplified view of books (just title + writer)
- Find books by writer or by title
- Loan a book to a user, as long as the book still has copies available

## How it's organized

```
model/        Book, User, Loan, Person, Admin — the plain data classes
Repository/   Where the data actually lives (in-memory arrays) and basic CRUD
Service/      The business logic layer that sits on top of the repositories
dto/          SimpleBook — a lighter view of a Book for listing
utility/      Validator — checks names, passwords, national codes
Main.java     A hand-written "demo" that exercises everything above
```

The rough idea: `Main` talks to a `Service`, and a `Service` talks to a `Repository`.
Nothing talks directly to the raw arrays except the repositories.

## Running it

It's a plain Maven project (Java 21).

```
mvn compile exec:java -Dexec.mainClass=Main
```

Or just run `Main.java` directly from your IDE — that's honestly the easiest way.


