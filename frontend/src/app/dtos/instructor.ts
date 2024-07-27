export interface InstructorDetailDto {
  id: number;
  firstName: string;
  lastName: string;
  isAdmin: boolean;
}

export interface InstructorCreateDto {
  firstName: string;
  lastName: string;
  isAdmin: boolean;
}

export interface InstructorLoginDto {
  firstName: string;
  lastName: string;
}
