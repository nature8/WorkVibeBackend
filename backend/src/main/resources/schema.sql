CREATE TABLE IF NOT EXISTS jobs (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    languages VARCHAR(255),
    requirements TEXT,
    experience VARCHAR(100),
    location VARCHAR(255),
    last_date_to_apply VARCHAR(100)
);