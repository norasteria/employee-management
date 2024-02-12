CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE leave_type (
id UUID DEFAULT uuid_generate_v4(),
name VARCHAR(225) NOT NULL,
quantity INT NOT NULL,
PRIMARY KEY (id)
);